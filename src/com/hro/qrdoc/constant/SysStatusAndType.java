/**
* @FileName: SysStatusAndType.java
* @Package: com.hro.qrdoc.constant
* @Copyright: 2018 bincool.github.io Inc. All Rights Reserved.
* @Description: SysStatusAndType.java: 系统状态和类型.
* @Author wchy，技术交流(891946049).
* @Date 2018年6月7日 下午5:45:08.
* @Content: 新增.
* @Version: V1.0.
*/
package com.hro.qrdoc.constant;

/**
* @ClassName: SysStatusAndType.java
* 
* @Description: 
* <p>
* 系统状态和类型.
* </p>
* <p>
* 详细描述：系统状态和类型常量物理意义化.
* </p>
* <p>
* 示例代码.
* </p>
*
* @Author: wchy，技术交流(891946049).
* 
* @Date: 2018年6月7日 下午5:45:08.
* 
*/
public interface SysStatusAndType 
{
	
	/**
	 * 二维码装箱页面bean校验结果.
	 */
	interface qrBoxPageParamsVerify 
	{
		/**
		 * 每箱个数错误.
		 */
		String ERR_COUNT = "qrboxpage.params.verify.err.count";
		
		/**
		 * 订单编号错误.
		 */
		String ERR_ORDERNUM = "qrboxpage.params.verify.err.ordernum";
		
		/**
		 * 大箱条码错误.
		 */
		String ERR_BIGBOXCODE = "qrboxpage.params.verify.err.bigboxcode";
		
		/**
		 * 装箱二维码错误.
		 */
		String ERR_QRCODETEXT = "qrboxpage.params.verify.err.qrcodetext";
		
		/**
		 * 校验通过.
		 */
		String OK = "qrboxpage.params.verify.ok";
	}
	
}
