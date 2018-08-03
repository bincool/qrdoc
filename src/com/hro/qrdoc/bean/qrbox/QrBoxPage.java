/**
* @FileName: QrBoxPage.java
* @Package: com.hro.qrdoc.bean.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: QrBoxPage.java: 二维码装箱页面bean.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午4:44:30.
* @Content: 新增.
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
* 二维码装箱页面bean.
* </p>
* <p>
* 详细描述：二维码装箱页面bean，包含用户输入的bean和后台所需的bean.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月7日 下午4:44:30.
* 
*/
public class QrBoxPage implements Serializable
{
	
	/**
	 * 序列版本号.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 计数输入框.
	 */
	private DefaultInputPanel countPanel;
	
	/**
	 * 订单编号输入框.
	 */
	private DefaultInputPanel orderNumPanel;
	
	/**
	 * 大箱条码输入框提示标签.
	 */
	private DefaultInputPanel bigBoxCodePanel;
	
	/**
	 * 装箱二维码文本域提示标签.
	 */
	private JLabel qrCodeTextLabel;
	
	/**
	 * 装箱二维码文本域.
	 */
	private JTextArea qrCodeText;
	
	/**
	 * 装箱二维码文件名,点击完成时使用.
	 */
	private String fileName;
	
	/**
	 * 二维码扫描装箱计数缓存.
	 */
	private Map<String, Integer> boxDataBuffer = new HashMap<String, Integer>();
	
	/**
	 * 二维码装箱bean.
	 */
	private QrcodeBoxBean qrcodeBoxBean = new QrcodeBoxBean();

	/**
	 * 获取countPanel.
	 * @return
	 *     countPanel.
	 */
	public DefaultInputPanel getCountPanel() 
	{
		return countPanel;
	}

	/**
	 * 设置countPanel.
	 * @param
	 *     countPanel.
	 */
	public void setCountPanel(DefaultInputPanel countPanel) 
	{
		this.countPanel = countPanel;
	}

	/**
	 * 获取orderNumPanel.
	 * @return
	 *     orderNumPanel.
	 */
	public DefaultInputPanel getOrderNumPanel() 
	{
		return orderNumPanel;
	}

	/**
	 * 设置orderNumPanel.
	 * @param
	 *     orderNumPanel.
	 */
	public void setOrderNumPanel(DefaultInputPanel orderNumPanel) 
	{
		this.orderNumPanel = orderNumPanel;
	}

	/**
	 * 获取bigBoxCodePanel.
	 * @return
	 *     bigBoxCodePanel.
	 */
	public DefaultInputPanel getBigBoxCodePanel() 
	{
		return bigBoxCodePanel;
	}

	/**
	 * 设置bigBoxCodePanel.
	 * @param
	 *     bigBoxCodePanel.
	 */
	public void setBigBoxCodePanel(DefaultInputPanel bigBoxCodePanel) 
	{
		this.bigBoxCodePanel = bigBoxCodePanel;
	}
	
	/**
	 * 获取qrCodeTextLabel.
	 * @return
	 *     qrCodeTextLabel.
	 */
	public JLabel getQrCodeTextLabel() 
	{
		return qrCodeTextLabel;
	}
	
	/**
	 * 设置qrCodeTextLabel.
	 * @param
	 *     qrCodeTextLabel.
	 */
	public void setQrCodeTextLabel(JLabel qrCodeTextLabel) 
	{
		this.qrCodeTextLabel = qrCodeTextLabel;
	}

	/**
	 * 获取qrCodeText.
	 * @return
	 *     qrCodeText.
	 */
	public JTextArea getQrCodeText() 
	{
		return qrCodeText;
	}

	/**
	 * 设置qrCodeText.
	 * @param
	 *     qrCodeText.
	 */
	public void setQrCodeText(JTextArea qrCodeText) 
	{
		this.qrCodeText = qrCodeText;
	}

	/**
	 * 获取qrcodeBoxBean.
	 * @return
	 *     qrcodeBoxBean.
	 */
	public QrcodeBoxBean getQrcodeBoxBean() 
	{
		return qrcodeBoxBean;
	}

	/**
	 * 设置qrcodeBoxBean.
	 * @param
	 *     qrcodeBoxBean.
	 */
	public void setQrcodeBoxBean(QrcodeBoxBean qrcodeBoxBean) 
	{
		this.qrcodeBoxBean = qrcodeBoxBean;
	}
	
	/**
	 * 获取fileName.
	 * @return
	 * 		fileName.
	 */
	public String getFileName() 
	{
		return fileName;
	}

	/**
	 * 设置fileName.
	 * @param fileName
	 * 		fileName.
	 */
	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}

	/**
	 * 获取boxDataBuffer.
	 * @return
	 * 		boxDataBuffer.
	 */
	public Map<String, Integer> getBoxDataBuffer() 
	{
		return boxDataBuffer;
	}

	/**
	 * 设置boxDataBuffer.
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
	 * 刷新qrcodeBoxBean对象，将用户输入的信息同步到qrcodeBoxBean对象.
	 */
	public void flushQrcodeBoxBean() 
	{
		qrcodeBoxBean.setCount(inputValue(countPanel));
		qrcodeBoxBean.setOrderNum(inputValue(orderNumPanel));
		qrcodeBoxBean.setBigBoxCode(inputValue(bigBoxCodePanel));
		qrcodeBoxBean.setQrCodeText(qrCodeText.getText());
	}
	
	/**
	 * 清除页面大箱码数据.
	 */
	public void clearBoxData() 
	{
		bigBoxCodePanel.resetInputText();
		qrCodeText.setText("");
		
		qrcodeBoxBean.setBigBoxCode("");
		qrcodeBoxBean.setQrCodeText("");
	}
	
	/**
	 * 初始化页面信息，包括全局变量.
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
	 * 获取DefaultInputPanel中的值.
	 * @param inputPanel
	 * @return
	 */
	private String inputValue(DefaultInputPanel inputPanel) 
	{
		return inputPanel == null ? null : inputPanel.getInputValue();
	}

}
