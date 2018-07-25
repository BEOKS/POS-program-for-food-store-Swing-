package FoodStore;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

class WarehousCancelJFrame extends JFrame {

    private JPanel contentPane;
    private JTextField orderTextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    WarehouseOrderFrame frame = new WarehouseOrderFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public WarehousCancelJFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 300, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("취소수량");
        lblNewLabel.setBounds(125, 100, 61, 16);
        contentPane.add(lblNewLabel);

        orderTextField = new JTextField();
        orderTextField.setBounds(200, 100, 130, 26);
        contentPane.add(orderTextField);
        orderTextField.setColumns(10);

        JButton okButton = new JButton("확인");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel defaultTableModel=(DefaultTableModel)WarehouseListPanel.table.getModel();
                int row=WarehouseListPanel.table.getSelectedRow();
                int data=Integer.parseInt(defaultTableModel.getValueAt(row,2).toString())-Integer.parseInt(orderTextField.getText());
                defaultTableModel.setValueAt(data,row,2);
                WarehouseInformationPanel.orderNum[row]=data;
                dispose();
            }
        });
        okButton.setBounds(72, 212, 117, 29);
        contentPane.add(okButton);

        JButton cancelButton = new JButton("취소");
        cancelButton.setBounds(269, 212, 117, 29);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        contentPane.add(cancelButton);
    }
}
