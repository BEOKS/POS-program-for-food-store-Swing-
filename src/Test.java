import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;

public class Test extends JFrame implements Serializable{
    public static void main(String[] args){
        Test test=new Test();
        test.setVisible(true);
    }

    public Test(){
        setSize(200,300);
        setLayout(new GridLayout(2,2));
        for(int i=0;i<11;i++){
            JButton jButton=new JButton(i+" ");
            add(jButton);
        }
        addWindowListener(new WindowListener(this));
    }
}
class WindowListener extends WindowAdapter {
    JFrame main=null;
    WindowListener(JFrame main){
        this.main=main;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JButton jButton=new JButton(99+" ");
        this.main.add(jButton);
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}