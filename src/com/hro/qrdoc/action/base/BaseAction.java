/**
* @FileName: BaseAction.java
* @Package: com.hro.qrdoc.action.base
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: BaseAction.java: 基础事件.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午12:56:36.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.action.base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import com.hro.qrdoc.constant.ApplicationConstant;

/**
* @ClassName: BaseAction.java
* 
* @Description: 
* <p>
* 基础事件.
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
* @Date: 2018年6月7日 下午12:56:36.
* 
*/
public class BaseAction implements ActionListener 
{
	
	/**
	 * 日志对象.
	 */
	protected static final Logger LOGGER = Logger.getLogger(BaseAction.class);

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane.showMessageDialog(null, ApplicationConstant.WARN_ACTION_FUN_NOTOPEN, ApplicationConstant.FRAME_TITLE, JOptionPane.WARNING_MESSAGE);
	}

}
