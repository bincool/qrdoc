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

import javax.swing.JTextArea;

import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

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
	 * װ���ά���ı���.
	 */
	private JTextArea qrCodeText;
	
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
	 * ��ȡDefaultInputPanel�е�ֵ.
	 * @param inputPanel
	 * @return
	 */
	private String inputValue(DefaultInputPanel inputPanel) 
	{
		return inputPanel == null ? null : inputPanel.getInputValue();
	}

}
