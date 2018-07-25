import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Scanner;


//TODO 2: 맨위(시간, 마감, 매출, 잔고) 설정
public class UpperPannel extends Panel implements Serializable{


    //TODO 2:컴포넌트 설정
    private JLabel todaysDateText=new JLabel();
    private Calendar todateDateInfo;
    private String todaysDate="";
    private Button closeStoreButton =new Button("closeStoreButton");
    private JLabel salesText=new JLabel();
    private int salesPrice=0;
    private JLabel balanceText=new JLabel();
    private int balance=0;
    public static final int UpperPanelHEIGHT=30;
    public static final int BLANKSIZE=10;
    private static int runCount=0;
    public UpperPannel(){
        //TODO 2-0: 초기설정
        GridBagLayout gridBagLayout=new GridBagLayout();
        setLayout(null);
        setBackground(Color.WHITE);

        //TODO 2-1: 날짜설정, 프로그램이 처음실생된 경우로 그시점으로 초기화 그 이후는 불러옴
        if(runCount==0){
            Calendar calendar=Calendar.getInstance();
            todateDateInfo=calendar;
            todaysDate+=calendar.get(calendar.YEAR)+"년 "+calendar.get(calendar.MONDAY)+
                    "월 "+calendar.get(calendar.DATE)+"일";
        }
        runCount++;
        todaysDateText.setText(todaysDate);
        todaysDateText.setBounds(20+BLANKSIZE,0+BLANKSIZE,100,UpperPanelHEIGHT);
        add(todaysDateText);


        //TODO 2-2: 마감설정
        closeStoreButton.setLabel("Close Store");
        closeStoreButton.setBounds(120+BLANKSIZE,0+BLANKSIZE,80,FoodStore.UpperPanelHEIGHT);
        add(closeStoreButton);

        //TODO 2-3:매출 설정
        salesText.setText("오늘 매출: "+salesPrice+"원");
        salesText.setBounds(FoodStore.MAXWIDTH-220+BLANKSIZE,0+BLANKSIZE,100,FoodStore.UpperPanelHEIGHT);
        add(salesText);

        //TODO 2-4:잔고 설정
        balanceText.setText("전체 잔고: "+balance+"원");
        balanceText.setBounds(FoodStore.MAXWIDTH-130+BLANKSIZE,0+BLANKSIZE,100,FoodStore.UpperPanelHEIGHT);
        add(balanceText);
    }

    //TODO 2-2: 마감설정
    public void closeStoreBtnMethod(){
        //TODO 2-2-1: 오늘날짜를 다음날로 넘긴다.
        todateDateInfo.add(Calendar.DATE,1);
        todaysDate+=todateDateInfo.get(todateDateInfo.YEAR)+"년 "+todateDateInfo.get(todateDateInfo.MONDAY)+
                "월 "+todateDateInfo.get(todateDateInfo.DATE)+"일";
        //TODO 2-2-2: 오늘 매출을 총 자금에 더하고 매출을 0으로 만든다.
        balance+=salesPrice;
        salesPrice=0;

        //TODO 2-2-3: 주문한 재료가 있다면 도착한 걸로 취급해 처리를 완료한다.

        //TODO 2-2-4: 직원의 급여 지불 날짜에 따라 급여를 지급한다.

        //TODO 2-2-5: 아직 계산하지 않은 테이블이 남은 경우 오류 출력, 마감 실행 x

        //TODO 2-2-6: 프로그램 종료시 데이터 저장

    }

    public String getTodaysDate() {
        return todaysDate;
    }

    public void setTodaysDate(String todaysDate) {
        this.todaysDate = todaysDate;
    }

    public Button getCloseStoreButton() {
        return closeStoreButton;
    }

    public void setCloseStoreButton(Button closeStoreButton) {
        this.closeStoreButton = closeStoreButton;
    }

    public JLabel getSalesText() {
        return salesText;
    }

    public void setSalesText(JLabel salesText) {
        this.salesText = salesText;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public JLabel getBalanceText() {
        return balanceText;
    }

    public void setBalanceText(JLabel balanceText) {
        this.balanceText = balanceText;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public JLabel getTodaysDateText() {

        return todaysDateText;
    }

    public void setTodaysDateText(JLabel todaysDateText) {
        this.todaysDateText = todaysDateText;
    }


}
