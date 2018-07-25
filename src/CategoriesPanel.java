import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

//TODO 3:메뉴 선택 및 종료 버튼 설정
public class CategoriesPanel extends JPanel implements Serializable{
    private Button tableButton,warehouseButton,memberButton,menuButton,employeeButton,quitButton;
    public static final int buttonWiDTH=100,buttonHEIGHT=30;
    public static final int categoriesPanelHEIGHT=40;
    public static final int BLANKSIZE=10;
    public CategoriesPanel(){
        tableButton=new Button("Table");
        warehouseButton=new Button("Warehouse");
        memberButton=new Button("Member");
        menuButton=new Button("Menu");
        employeeButton=new Button("Employee");
        quitButton=new Button("Quit");

        setLayout(null);
        JPanel jPanel=new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
        jPanel.add(tableButton);    jPanel.add(warehouseButton);
        jPanel.add(memberButton);   jPanel.add(menuButton);
        jPanel.add(employeeButton);
        jPanel.setBounds(0,0,buttonWiDTH*5,categoriesPanelHEIGHT);
        jPanel.setBackground(Color.WHITE);
        add(jPanel);

        quitButton.setBounds(FoodStore.MAXWIDTH-buttonWiDTH-40,0,buttonWiDTH,buttonHEIGHT);
        add(quitButton);
    }
}
