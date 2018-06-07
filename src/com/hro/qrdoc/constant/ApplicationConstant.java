/**
* @FileName: ApplicationConstant.java
* @Package: xyz.wchy.constant
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: ApplicationConstant.java: 记事本常量-可配置.
* @Author wchy，技术交流(891946049).
* @Date 2018年1月31日 上午16:38:40.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.constant;

import java.util.Map;

import com.hro.qrdoc.utils.ApplicationConfigHelper;

/**
* @ClassName: ApplicationConstant.java
* 
* @Description: 
* <p>
* 记事本常量-可在application.properties中配置其常量具体值.
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
* @Date: 2018年1月31日 上午16:38:40.
* 
*/
public interface ApplicationConstant 
{
	
	/**
	 * 应用配置.
	 */
	Map<String, String> APP_CONFIGS = ApplicationConfigHelper.getInstance().getPropMap();
	
	/**
	 * Frame标题.
	 */
	String FRAME_TITLE = APP_CONFIGS.get("frame.title");
	
	/**
	 * logo图标路径.
	 */
	String FRAME_ICON_PATH = APP_CONFIGS.get("frame.icon.path");
	
	/**
	 * 图标路径：取消显示图标路径.
	 */
	String FRAME_CANCEL_SHOW_PATH = APP_CONFIGS.get("image.cancel.show.path");
	
	/**
	 * 图标路径：取消隐藏图标路径.
	 */
	String FRAME_CANCEL_HIDE_PATH = APP_CONFIGS.get("image.cancel.hide.path");
	
	/**
	 * label标题：每箱个数.
	 */
	String LABEL_TITLE_COUNT = APP_CONFIGS.get("label.title.count");
	
	/**
	 * label标题：订单编号.
	 */
	String LABEL_TITLE_ORDERNUM = APP_CONFIGS.get("label.title.ordernum");
	
	/**
	 * label标题：大箱条码.
	 */
	String LABEL_TITLE_BIGBOXCODE = APP_CONFIGS.get("label.title.bigboxcode");
	
	/**
	 * label标题：装箱二维码：已装箱 {0} 箱 {0} 个.
	 */
	String LABEL_TITLE_QRCODETEXT = APP_CONFIGS.get("label.title.qrcodetext");
	
	/**
	 * button标题：下一箱.
	 */
	String BUTTON_TITLE_NEXTBTN = APP_CONFIGS.get("button.title.nextbtn");
	
	/**
	 * button标题：结束.
	 */
	String BUTTON_TITLE_FINISHBTN = APP_CONFIGS.get("button.title.finishbtn");
	
	/**
	 * 警告提示：action功能未开放警告.
	 */
	String WARN_ACTION_FUN_NOTOPEN = APP_CONFIGS.get("warn.action.fun.notopen");
	
}
