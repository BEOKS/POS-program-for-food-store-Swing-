package FoodStore;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class FirstSettingPanel extends JFrame implements Serializable{

	private JPanel biggestPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstSettingPanel frame = new FirstSettingPanel();
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
	public static final int FIRSTPANEL_WIDTH=1200,FIRSTPANEL_HEIGHT=960;
	public static final int MAIN_DESCRIPTION_PANLE_WIDTH=1176,MAIN_DESCRIPTION_PANLE_HEIGHT=750;


	public static WarehouseMainPanel warehouseMainPanel=new WarehouseMainPanel();
	public static TableMainPanel tableMainPanel=new TableMainPanel();
	public static MenuMainPanel menuMainPanel=new MenuMainPanel();
	public static MemberMainPanel memberMainPanel=new MemberMainPanel();
	public static StaffMainPanel staffMainPanel=new StaffMainPanel();

	public static JPanel menusPanel = new JPanel();
	public static JButton closeButton;

	//TODO 1-1:날짜 변수
	public static Calendar todateDateInfo;
	private String todaysDate="";
	private static int runCount=0;
	//매출, 잔고 변수
	private int salesPrice=0,balance=0;


	public static JLabel saleLabel = new JLabel("<dynamic>");
	public FirstSettingPanel() {
        for(int i=0;i<100;i++){
            WarehouseInformationPanel.orderNum[i]=0;
        }
		//TODO load exist panels or create new
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, FIRSTPANEL_WIDTH, FIRSTPANEL_HEIGHT);
		biggestPanel = new JPanel();
		biggestPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(biggestPanel);
		biggestPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 1176, 67);
		biggestPanel.add(panel);
		panel.setLayout(null);

		//TODO 1: 날짜세팅하기 -프로그램이 처음실행된날을 저장하고 마감을 한 후에는 +1일을
		//date setting
		ObjectInputStream dateFileReader=null;
		try{
			dateFileReader=new ObjectInputStream(new FileInputStream("dateFile1.dat"));
			todateDateInfo=(Calendar)dateFileReader.readObject();
			dateFileReader.close();
			//TODO date file write
		}
		catch (FileNotFoundException e){
			BufferedWriter dateFileWriter;
			try{
				Calendar calendar=Calendar.getInstance();
				todateDateInfo=calendar;
				todaysDate+=calendar.get(calendar.YEAR)+"년 "+(calendar.get(calendar.MONDAY)+1)+
						"월 "+calendar.get(calendar.DATE)+"일";
				//TODO date file write
				ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("dateFile1.dat"));
				outputStream.writeObject(calendar);
				outputStream.close();
			}
			catch (IOException e2){
				System.err.println(e2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		todaysDate=todateDateInfo.get(todateDateInfo.YEAR)+"년 "+(todateDateInfo.get(todateDateInfo.MONDAY)+1)+
				"월 "+todateDateInfo.get(todateDateInfo.DATE)+"일";

		//date Panel
		JLabel dateJLabel = new JLabel("dateJLabel");
		dateJLabel.setBounds(6, 11, 212, 37);
		panel.add(dateJLabel);
		dateJLabel.setText(todaysDate);
		//TODO 2:마감 버튼설정
		JLabel boundLabel = new JLabel("<dynamic>");
		JButton closeStoreButton = new JButton("마감");
		closeStoreButton.setBounds(213, 11, 117, 37);
		closeStoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO 2-2-5: 아직 계산하지 않은 테이블이 남은 경우 오류 출력, 마감 실행 x
				if(TLP1.Tok != false || TLP2.Tok != false || TLP3.Tok != false
						|| TLP4.Tok != false || TLP5.Tok != false || TLP6.Tok != false
						|| TLP7.Tok != false || TLP8.Tok != false || TLP9.Tok != false) {
					System.err.println("아직 계산하지 않은 테이블이 있습니다.");
				}else {
					//TODO 2-2-1: 오늘날짜를 다음날로 넘긴다.
    				int d=0;
    				todateDateInfo.add(Calendar.DATE,1);
    				todaysDate=todateDateInfo.get(todateDateInfo.YEAR)+"년 "+(todateDateInfo.get(todateDateInfo.MONDAY)+1)+
    		          "월 "+todateDateInfo.get(todateDateInfo.DATE)+"일";
    				dateJLabel.setText(todaysDate);
    				try{
    					ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("dateFile1.dat"));
    					objectOutputStream.writeObject(todateDateInfo);
    				} catch (FileNotFoundException e1) {
    					e1.printStackTrace();
    				} catch (IOException e1) {
    					e1.printStackTrace();
    				}

					//TODO 2-2-3: 주문한 재료가 있다면 도착한 걸로 취급해 처리를 완료한다.
                    int orderSum=0;
                    DefaultTableModel defaultTableModel=(DefaultTableModel)WarehouseListPanel.table.getModel();
    				for(int i=0;i<WarehouseListPanel.rowNum;i++){
                        orderSum+=Integer.parseInt(defaultTableModel.getValueAt(i,3).toString())*WarehouseInformationPanel.orderNum[i];
                        defaultTableModel.setValueAt(Integer.parseInt(defaultTableModel.getValueAt(i,1).toString())+
                        WarehouseInformationPanel.orderNum[i],i,1);
                        defaultTableModel.setValueAt(0,i,2);
                    }
                    balance-=orderSum;
    				for(int i=0;i<100;i++){
                        WarehouseInformationPanel.orderNum[i]=0;
                    }
					//TODO 2-2-4: 직원의 급여 지불 날짜에 따라 급여를 지급한다.
					int tmpCount = 0;

					Calendar cal = Calendar.getInstance();

					int tmpdate = cal.get(cal.DATE);

					while (tmpCount <= StaffListPanel.idx && StaffListPanel.idx != 0) {


						int tmpComp = (int) StaffListPanel.StaffInfo[tmpCount][4];

						if (tmpComp == tmpdate) {

							int g = Integer.parseInt(StaffListPanel.StaffList.getValueAt(tmpCount, 2).toString());

							balance = balance - g;

						}

						tmpCount++;

					}

					//TODO 2-2-2: 오늘 매출을 총 자금에 더하고 매출을 0으로 만든다.

					salesPrice += (int) TableMainPanel.result;

					balance += salesPrice;

					salesPrice = 0;

					TableMainPanel.result = 0;

					saleLabel.setText("오늘 매출: " + salesPrice + "원");

					boundLabel.setText("전체 잔고: " + balance + "원");
				}

			}
		});
		panel.add(closeStoreButton);

		JPanel mainDescriptionPanel = new JPanel();
		mainDescriptionPanel.setLayout(null);
		mainDescriptionPanel.setBounds(6, 164, MAIN_DESCRIPTION_PANLE_WIDTH, MAIN_DESCRIPTION_PANLE_HEIGHT);
		mainDescriptionPanel.setBackground(Color.WHITE);



		saleLabel.setBounds(756, 10, 190, 37);
		panel.add(saleLabel);
		saleLabel.setText("오늘 매출: "+salesPrice+"원");


		boundLabel.setBounds(961, 10, 190, 37);
		panel.add(boundLabel);
		boundLabel.setText("전체 잔고: "+balance+"원");



		JPanel menusPanel = new JPanel();
		menusPanel.setBounds(6, 85, 1176, 67);
		biggestPanel.add(menusPanel);
		menusPanel.setLayout(null);

		JButton tableButton = new JButton("테이블");
		tableButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//change main panel to table panel
				biggestPanel.setBackground(Color.WHITE);
				mainDescriptionPanel.removeAll();
				mainDescriptionPanel.add(tableMainPanel);
				mainDescriptionPanel.repaint();
//          ((CardLayout)mainDescriptionPanel.getLayout()).show(mainDescriptionPanel,"tablePanel");
			}
		});
		tableButton.setBounds(6, 6, 125, 55);
		menusPanel.add(tableButton);

		JButton memberButton = new JButton("회원");
		memberButton.setBounds(280, 6, 119, 55);
		memberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				biggestPanel.setBackground(Color.WHITE);
				mainDescriptionPanel.removeAll();
				mainDescriptionPanel.add(memberMainPanel);
				mainDescriptionPanel.repaint();
			}
		});
		menusPanel.add(memberButton);

		JButton employeeButton = new JButton("직원");
		employeeButton.setBounds(548, 6, 119, 55);
		employeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//change main panel to employee panel
				biggestPanel.setBackground(Color.WHITE);
				mainDescriptionPanel.removeAll();
				mainDescriptionPanel.add(staffMainPanel);
				mainDescriptionPanel.repaint();
			}
		});
		menusPanel.add(employeeButton);

		//TODO 3:창고 테이블 세팅

		//TODO 3-1: 창고테이블 초기생성 및 세팅
		JButton wareHouseaButton = new JButton("창고");
		wareHouseaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//change main panel to warehouse panel
				biggestPanel.setBackground(Color.WHITE);
				mainDescriptionPanel.removeAll();
				mainDescriptionPanel.add(warehouseMainPanel);
				mainDescriptionPanel.repaint();
//          ((CardLayout)mainDescriptionPanel.getLayout()).show(mainDescriptionPanel,"warehousePanel");
//          mainDescriptionPanel.repaint();

			}
		});


		wareHouseaButton.setBounds(143, 6, 125, 55);
		menusPanel.add(wareHouseaButton);

		JButton menuButton = new JButton("메뉴");
		menuButton.setBounds(411, 6, 125, 55);
		menuButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				biggestPanel.setBackground(Color.WHITE);
				mainDescriptionPanel.removeAll();
				mainDescriptionPanel.add(menuMainPanel);
				mainDescriptionPanel.repaint();
			}
		});
		menusPanel.add(menuButton);

		closeButton = new JButton("종료");
		closeButton.setBounds(1029, 6, 125, 55);
		menusPanel.add(closeButton);



		biggestPanel.add(mainDescriptionPanel);


	}
}