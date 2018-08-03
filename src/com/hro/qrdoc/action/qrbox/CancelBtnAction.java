/**
* @FileName: CancelBtnAction.java
* @Package: com.hro.qrdoc.action.qrbox
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: CancelBtnAction.java: 取消重置按钮事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午2:40:22.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.qrbox;

import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import org.apache.log4j.Logger;

import com.hro.qrdoc.action.base.BaseAction;

/**
* @ClassName: CancelBtnAction.java
* 
* @Description: 
* <p>
* 取消重置按钮事件.
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
* @Date: 2018年6月7日 下午2:40:22.
* 
*/
public class CancelBtnAction extends BaseAction 
{
	
	/**
	 * 日志对象.
	 */
	private static final Logger LOGGER = Logger.getLogger(CancelBtnAction.class);
	
	/**
	 * 文本输入框.
	 */
	private JTextField inputText;
	
	/**
	 * 有参数构造函数.
	 * @param inputText
	 * 		待取消重置的inputText框.
	 */
	public CancelBtnAction(JTextField inputText) 
	{
		this.inputText = inputText;
	}

	/* (non-Javadoc)
	 * @see com.hro.qrdoc.action.base.BaseAction#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		LOGGER.info("Input box contents reset, the data is : " + inputText.getText());
		inputText.setText("");
	}
	
}
