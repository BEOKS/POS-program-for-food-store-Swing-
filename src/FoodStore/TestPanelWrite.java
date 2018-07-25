package FoodStore;

import java.io.*;

public class TestPanelWrite {
    public static void main(String[] args){
        FirstSettingPanel warehouseInformationPanel=new FirstSettingPanel();
        ObjectOutputStream objectOutputStream=null;
        try{
            objectOutputStream=new ObjectOutputStream(new FileOutputStream("FirstSettingPanel.dat"));
            objectOutputStream.writeObject(warehouseInformationPanel);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FirstSettingPanel get=null;
        try {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("FirstSettingPanel.dat"));
            get=(FirstSettingPanel)objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
