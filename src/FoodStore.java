import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class FoodStore extends JFrame implements Serializable{
    public static void main(String[] args){
        FoodStore foodStore=new FoodStore();
        foodStore.setVisible(true);
    }
    //TODO 1:초기 세팅
    public static final int MAXWIDTH=800,MAXHEIGHT=500;
    public static final int UpperPanelHEIGHT=30;
    public FoodStore(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (Exception e) {
            e.printStackTrace();
        }
        setTitle("Food Store");
        setSize(MAXWIDTH,MAXHEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        //TODO 2: 맨위(시간, 마감, 매출, 잔고) 설정
        UpperPannel upperPannel=new UpperPannel();
        upperPannel.setBounds(0,0,MAXWIDTH,UpperPanelHEIGHT+10);
        add(upperPannel);

        //TODO 3:메뉴 선택 및 종료 버튼 설정
        CategoriesPanel categoriesPanel=new CategoriesPanel();
        categoriesPanel.setBounds(0,UpperPanelHEIGHT+10,MAXWIDTH,categoriesPanel.categoriesPanelHEIGHT);
        categoriesPanel.setBackground(Color.WHITE);
        add(categoriesPanel);
    }
}
