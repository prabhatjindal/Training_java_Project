import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;

public class print implements Printable, ActionListener {

    JFrame frameToPrint;

    public int print(Graphics g, PageFormat pf, int page) throws
                                                        PrinterException {

        if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }

        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        /* Now print the window and its visible contents */
        frameToPrint.printAll(g);

        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }

    public void actionPerformed(ActionEvent e) {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
         }
    }

    public print(JFrame f) {
        frameToPrint = f;
    }

    public static void main(String args[]) {
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {System.exit(0);}
        });
        JTextArea text = new JTextArea(50, 20);
        for (int i=1;i<=50;i++) {
            text.append("Line " + i + "\n");
        }
        JScrollPane pane = new JScrollPane(text);
        pane.setPreferredSize(new Dimension(250,200));
        f.add("Center", pane);
        JButton printButton = new JButton("Print This Window");
        printButton.addActionListener(new print(f));
        f.add("South", printButton);
        f.pack();
        f.setVisible(true);
    }
}