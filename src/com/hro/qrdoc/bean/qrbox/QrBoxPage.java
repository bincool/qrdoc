/**
* @FileName: QrBoxPage.java
* @Package: com.hro.qrdoc.bean.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrBoxPage.java: ��ά��װ��ҳ��bean.
* @Author wchy����������(891946049).
* @Date 2018��6��7�� ����4:44:30.
* @Content: ����.
* @Version: V1.0.
*/
package com.hro.qrdoc.bean.qrbox;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.hro.qrdoc.constant.ApplicationConstant;
import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

import io.github.bincool.utils.MakeRandCode;

/**
* @ClassName: QrBoxPage.java
* 
* @Description: 
* <p>
* ��ά��װ��ҳ��bean.
* </p>
* <p>
* ��ϸ��������ά��װ��ҳ��bean�������û������bean�ͺ�̨�����bean.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��7�� ����4:44:30.
* 
*/
/**
* @ClassName: QrBoxPage.java
* 
* @Description: 
* <p>
* һ�仰��������������.
* </p>
* <p>
* ��ϸ����.
* </p>
* <p>
* ʾ������.
* </p>
*
* @Author: wchy����������(891946049).
* 
* @Date: 2018��6��7�� ����4:49:04.
* 
*/
public class QrBoxPage implements Serializable
{
	
	/**
	 * ���а汾��.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ���������.
	 */
	private DefaultInputPanel countPanel;
	
	/**
	 * ������������.
	 */
	private DefaultInputPanel orderNumPanel;
	
	/**
	 * ���������������ʾ��ǩ.
	 */
	private DefaultInputPanel bigBoxCodePanel;
	
	/**
	 * װ���ά���ı�����ʾ��ǩ.
	 */
	private JLabel qrCodeTextLabel;
	
	/**
	 * װ���ά���ı���.
	 */
	private JTextArea qrCodeText;
	
	/**
	 * װ���ά���ļ���,������ʱʹ��.
	 */
	private String fileName;
	
	/**
	 * ��ά��ɨ��װ���������.
	 */
	private Map<String, Integer> boxDataBuffer = new HashMap<String, Integer>();
	
	/**
	 * ��ά��װ��bean.
	 */
	private QrcodeBoxBean qrcodeBoxBean = new QrcodeBoxBean();

	/**
	 * ��ȡcountPanel.
	 * @return
	 *     countPanel.
	 */
	public DefaultInputPanel getCountPanel() 
	{
		return countPanel;
	}

	/**
	 * ����countPanel.
	 * @param
	 *     countPanel.
	 */
	public void setCountPanel(DefaultInputPanel countPanel) 
	{
		this.countPanel = countPanel;
	}

	/**
	 * ��ȡorderNumPanel.
	 * @return
	 *     orderNumPanel.
	 */
	public DefaultInputPanel getOrderNumPanel() 
	{
		return orderNumPanel;
	}

	/**
	 * ����orderNumPanel.
	 * @param
	 *     orderNumPanel.
	 */
	public void setOrderNumPanel(DefaultInputPanel orderNumPanel) 
	{
		this.orderNumPanel = orderNumPanel;
	}

	/**
	 * ��ȡbigBoxCodePanel.
	 * @return
	 *     bigBoxCodePanel.
	 */
	public DefaultInputPanel getBigBoxCodePanel() 
	{
		return bigBoxCodePanel;
	}

	/**
	 * ����bigBoxCodePanel.
	 * @param
	 *     bigBoxCodePanel.
	 */
	public void setBigBoxCodePanel(DefaultInputPanel bigBoxCodePanel) 
	{
		this.bigBoxCodePanel = bigBoxCodePanel;
	}
	
	/**
	 * ��ȡqrCodeTextLabel.
	 * @return
	 *     qrCodeTextLabel.
	 */
	public JLabel getQrCodeTextLabel() 
	{
		return qrCodeTextLabel;
	}
	
	/**
	 * ����qrCodeTextLabel.
	 * @param
	 *     qrCodeTextLabel.
	 */
	public void setQrCodeTextLabel(JLabel qrCodeTextLabel) 
	{
		this.qrCodeTextLabel = qrCodeTextLabel;
	}

	/**
	 * ��ȡqrCodeText.
	 * @return
	 *     qrCodeText.
	 */
	public JTextArea getQrCodeText() 
	{
		return qrCodeText;
	}

	/**
	 * ����qrCodeText.
	 * @param
	 *     qrCodeText.
	 */
	public void setQrCodeText(JTextArea qrCodeText) 
	{
		this.qrCodeText = qrCodeText;
	}

	/**
	 * ��ȡqrcodeBoxBean.
	 * @return
	 *     qrcodeBoxBean.
	 */
	public QrcodeBoxBean getQrcodeBoxBean() 
	{
		return qrcodeBoxBean;
	}

	/**
	 * ����qrcodeBoxBean.
	 * @param
	 *     qrcodeBoxBean.
	 */
	public void setQrcodeBoxBean(QrcodeBoxBean qrcodeBoxBean) 
	{
		this.qrcodeBoxBean = qrcodeBoxBean;
	}
	
	/**
	 * ��ȡfileName.
	 * @return
	 * 		fileName.
	 */
	public String getFileName() 
	{
		return fileName;
	}

	/**
	 * ����fileName.
	 * @param fileName
	 * 		fileName.
	 */
	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}

	/**
	 * ��ȡboxDataBuffer.
	 * @return
	 * 		boxDataBuffer.
	 */
	public Map<String, Integer> getBoxDataBuffer() 
	{
		return boxDataBuffer;
	}

	/**
	 * ����boxDataBuffer.
	 * @param boxDataBuffer
	 * 		boxDataBuffer.
	 */
	public void setBoxDataBuffer(Map<String, Integer> boxDataBuffer) 
	{
		this.boxDataBuffer = boxDataBuffer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		StringBuffer sb = new StringBuffer();
		sb.append("QrBoxPage [countPanel=");
		sb.append(inputValue(countPanel));
		sb.append(", orderNumPanel=");
		sb.append(inputValue(orderNumPanel));
		sb.append(", bigBoxCodePanel=");
		sb.append(inputValue(bigBoxCodePanel));
		sb.append(", qrCodeText=");
		sb.append(qrCodeText.getText());
		sb.append(", qrcodeBoxBean=");
		sb.append(qrcodeBoxBean);
		sb.append("]");
		return sb.toString();
	}
	
	/**
	 * ˢ��qrcodeBoxBean���󣬽��û��������Ϣͬ����qrcodeBoxBean����.
	 */
	public void flushQrcodeBoxBean() 
	{
		qrcodeBoxBean.setCount(inputValue(countPanel));
		qrcodeBoxBean.setOrderNum(inputValue(orderNumPanel));
		qrcodeBoxBean.setBigBoxCode(inputValue(bigBoxCodePanel));
		qrcodeBoxBean.setQrCodeText(qrCodeText.getText());
	}
	
	/**
	 * ���ҳ�����������.
	 */
	public void clearBoxData() 
	{
		bigBoxCodePanel.resetInputText();
		qrCodeText.setText("");
		
		qrcodeBoxBean.setBigBoxCode("");
		qrcodeBoxBean.setQrCodeText("");
	}
	
	/**
	 * ��ʼ��ҳ����Ϣ������ȫ�ֱ���.
	 */
	public void initQrBoxPage() 
	{
		qrCodeText.setEnabled(false);
		
		countPanel.resetInputText();
		orderNumPanel.resetInputText();
		bigBoxCodePanel.resetInputText();
		qrCodeTextLabel.setText(ApplicationConstant.LABEL_TITLE_QRCODETEXT.replace("x", "0").replace("y", "0"));
		qrCodeText.setText("");
		
		qrcodeBoxBean.setCount("");
		qrcodeBoxBean.setOrderNum("");
		qrcodeBoxBean.setBigBoxCode("");
		qrcodeBoxBean.setQrCodeText("");
		
		Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        MakeRandCode randCodes = new MakeRandCode();
        randCodes.createRandCode(10);
        String fileName = sdf.format(d) + "_" + randCodes.obtainRandCode();
		this.setFileName(ApplicationConstant.QRDOC_FILE_ROOT_PATH + fileName);
		this.getBoxDataBuffer().clear();
	}
	
	/**
	 * ��ȡDefaultInputPanel�е�ֵ.
	 * @param inputPanel
	 * @return
	 */
	private String inputValue(DefaultInputPanel inputPanel) 
	{
		return inputPanel == null ? null : inputPanel.getInputValue();
	}

}
