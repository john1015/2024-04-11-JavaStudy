import java.util.*;
import javax.swing.*;
import java.awt.*;
public class JoinPanel extends JFrame{
    JLabel tLa,iLa,pLa1,nLa,sLa,bLa,pLa,aLa1,aLa2,telLa,cLa,eLa,empLa;
    JTextField idtf,nametf,birthtf,posttf,addrtf1,addrtf2,teltf,emailtf,emptf;
    JTextArea cta;
    JButton b1,b2,b3,b4;
    JRadioButton rb1,rb2;
    JComboBox box;
    JPasswordField pf;
    
    public JoinPanel()
    {
    	setLayout(null);
    	tLa=new JLabel("회원 가입",JLabel.CENTER);
    	tLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
    	tLa.setBounds(10, 45, 1260, 40);
    	add(tLa);
    	
    	iLa=new JLabel("*아이디",JLabel.RIGHT);
    	iLa.setBounds(350, 110, 90, 30);
    	add(iLa);
    	
    	idtf=new JTextField();
    	idtf.setBounds(465, 110, 200, 30);
    	add(idtf);
    	idtf.setEnabled(false);
    	
    	b1=new JButton("아이디 중복체크");
    	
    	b1.setBounds(670, 110, 150, 30);
    	add(b1);
    	/////////////////////////////////////////////////////////////// id
    	pLa1=new JLabel("*비밀번호",JLabel.RIGHT);
    	pLa1.setBounds(350, 160, 90, 30);
    	add(pLa1);
    	
    	pf=new JPasswordField();
    	pf.setBounds(465, 160, 200, 30);
    	add(pf);
    	///////////////////////////////////////////////////////////////
    	nLa=new JLabel("*이름",JLabel.RIGHT);
    	nLa.setBounds(350, 200, 90, 30);
    	add(nLa);
    	
    	nametf=new JTextField();
    	nametf.setBounds(465, 200, 200, 30);
    	add(nametf);
    	////////////////////////////////////////////////////////////////
    	sLa=new JLabel("*성별",JLabel.RIGHT);
    	sLa.setBounds(350, 240, 90, 30);
    	add(sLa);
    	
    	rb1=new JRadioButton("남자");
    	rb1.setBounds(465, 240, 70, 30);
    	add(rb1);
    	
    	rb2=new JRadioButton("여자");
    	rb2.setBounds(540, 240, 70, 30);
    	add(rb2);
    	
    	ButtonGroup bg=new ButtonGroup();
    	bg.add(rb1); bg.add(rb2);
    	
    	
    	rb1.setSelected(true);
    	/////////////////////////////////////////////////////////////
    	telLa=new JLabel("*전화",JLabel.RIGHT);
    	telLa.setBounds(350, 280, 90, 30);
    	add(telLa);
    	
    	box=new JComboBox();
    	box.addItem("010");
    	box.setBounds(465, 280, 90, 30);
    	add(box);
    	
    	teltf=new JTextField();
    	teltf.setBounds(570, 280, 200, 30);
    	add(teltf);
    	///////////////////////////////////////////////////////////
    	pLa=new JLabel("*우편번호",JLabel.RIGHT);
    	pLa.setBounds(350, 320, 90, 30);
    	add(pLa);
    	
    	posttf=new JTextField();
    	posttf.setBounds(465, 320, 200, 30);
    	add(posttf);
    	
    	posttf.setEnabled(false);
    	posttf.setHorizontalAlignment(JLabel.CENTER);
    	
    	b2=new JButton("우편번호 검색");
    	
    	b2.setBounds(670, 320, 150, 30);
    	add(b2);
    	////////////////////////////////////////////////////////////
    	aLa1=new JLabel("*주소",JLabel.RIGHT);
    	aLa1.setBounds(350, 360, 90, 30);
    	add(aLa1);
    	
    	addrtf1=new JTextField();
    	addrtf1.setBounds(465, 360, 450, 30);
    	add(addrtf1);
    	
    	aLa2=new JLabel("상세주소",JLabel.RIGHT);
    	aLa2.setBounds(350, 400, 90, 30);
    	add(aLa2);
    	
    	addrtf2=new JTextField();
    	addrtf2.setBounds(465, 400, 450, 30);
    	add(addrtf2);
    	///////////////////////////////////////////////////////////
    	eLa=new JLabel("이메일",JLabel.RIGHT);
    	eLa.setBounds(350, 440, 90, 30);
    	add(eLa);
    	
    	emailtf=new JTextField();
    	emailtf.setBounds(465, 440, 450, 30);
    	add(emailtf);
    	////////////////////////////////////////////////////////////
    	bLa=new JLabel("*생년월일",JLabel.RIGHT);
    	bLa.setBounds(350, 480, 90, 30);
    	add(bLa);
    	
    	birthtf=new JTextField();
    	birthtf.setBounds(465, 480, 200, 30);
    	add(birthtf);
    	////////////////////////////////////////////////////////////
    	empLa=new JLabel("사번",JLabel.RIGHT);
    	empLa.setBounds(350, 520, 90, 30);
    	add(empLa);
    	
    	emptf=new JTextField();
    	emptf.setBounds(465, 520, 200, 30);
    	add(emptf);
    	
    	
    	
    	b3=new JButton("회원가입");
    	b4=new JButton("취소");
    	
    	JPanel p=new JPanel();
    	p.add(b3);p.add(b4);
    	
    	p.setBounds(350, 590, 565, 35);
    	add(p);
    	
    	setSize(1280,720);
    	setVisible(true);
    }
    
    public static void main(String[] args) {
		new JoinPanel();
	}
}