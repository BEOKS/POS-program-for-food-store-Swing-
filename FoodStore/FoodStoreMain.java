package FoodStore;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FoodStoreMain implements Serializable{
    public static void main(String[] args) throws IOException {
        FirstSettingPanel firstSettingPanel=null;
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("FoodStoreMain.dat"));
            firstSettingPanel=(FirstSettingPanel)objectInputStream.readObject();
            objectInputStream.close();
        }
        catch (FileNotFoundException e){
            firstSettingPanel=new FirstSettingPanel();
            firstSettingPanel.closeButton.addActionListener(new closeActionListener(firstSettingPanel));        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        firstSettingPanel.closeButton = new JButton("종료");
        firstSettingPanel.closeButton.setBounds(1029, 6, 125, 55);
        firstSettingPanel.menusPanel.add(firstSettingPanel.closeButton);
        firstSettingPanel.closeButton.addActionListener(new closeActionListener(firstSettingPanel));
        firstSettingPanel.setVisible(true);
    }
}
class closeActionListener implements ActionListener{
    private FirstSettingPanel firstSettingPanel=null;
    closeActionListener(FirstSettingPanel firstSettingPanel){
        this.firstSettingPanel=firstSettingPanel;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //TODO 지금까지 수정된 프레임저장
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("FoodStoreMain.dat"));
            objectOutputStream.writeObject(this.firstSettingPanel);
            objectOutputStream.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        firstSettingPanel.dispose();
    }
}
