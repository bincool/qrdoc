/**
* @FileName: CountInputListener.java
* @Package: com.hro.qrdoc.action.listener
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: CountInputListener.java: 每箱个数文本监听器.
* @Author wchy，技术交流(891946049).
* @Date 2018年7月26日 下午4:42:46.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.listener;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.hro.qrdoc.ui.panel.base.DefaultInputPanel;

import io.github.bincool.utils.commons.StringUtils;

/**
* @ClassName: CountInputListener.java
* 
* @Description: 
* <p>
* 每箱个数文本监听器.
* </p>
* <p>
* 详细描述.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年7月26日 下午4:42:46.
* 
*/
public class CountInputListener implements DocumentListener 
{
	
	/**
	 * 每箱个数组件.
	 */
	private DefaultInputPanel countPanel;
	
	/**
	 * 二维码输入文本域.
	 */
	private JTextArea qrCodeText;
	
	/**
	 * 构造函数.
	 * @param countPanel
	 * @param qrCodeText
	 */
	public CountInputListener(DefaultInputPanel countPanel, JTextArea qrCodeText) 
	{
		this.countPanel = countPanel;
		this.qrCodeText = qrCodeText;
	}

	@Override
    public void insertUpdate(DocumentEvent e) 
	{
		setQrCodeTextEnabled();
    }

    @Override
    public void removeUpdate(DocumentEvent e) 
    {
    	setQrCodeTextEnabled();
    }

    @Override
    public void changedUpdate(DocumentEvent e) 
    {
    	setQrCodeTextEnabled();
    }
    
    /**
     * 设置qrCodeText的enabled属性.
     */
    private void setQrCodeTextEnabled() 
    {
    	if (StringUtils.isNotEmpty(countPanel.getInputValue())) 
		{
			qrCodeText.setEnabled(true);
		} 
		else 
		{
			qrCodeText.setEnabled(false);
		}
    }

}
