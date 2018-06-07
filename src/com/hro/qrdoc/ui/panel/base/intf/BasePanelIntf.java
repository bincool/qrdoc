/**
* @FileName: BasePanelIntf.java
* @Package: com.hro.qrdoc.ui.panel.base.intf
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: BasePanelIntf.java: 基础panel接口.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午4:11:55.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.ui.panel.base.intf;

/**
* @ClassName: BasePanelIntf.java
* 
* @Description: 
* <p>
* 基础panel接口.
* </p>
* <p>
* 详细描述：自定义panel约束，需要包含初始化布局和初始化事件绑定.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月7日 下午4:11:55.
* 
*/
public interface BasePanelIntf 
{
	
	/**
	 * 初始化布局.
	 */
	void initLayout();
	
	/**
	 * 初始化事件.
	 */
	void initAction();
	
}
