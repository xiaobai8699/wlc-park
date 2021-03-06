package com.perenc.xh.lsp.entity.tcCar;

import javax.persistence.Table;


@Table(name="tc_car_outpass")
public class TcCarOutpass implements java.io.Serializable{

	private static final long serialVersionUID = 1519727525609985175L;
	
	//columns START
    /**
     * 序号       db_column: id  
     * 
     */
	private String id;
	
    /**
     * 停车场ID 关联tc_parklot表的id       db_column: parklot_id  
     * @NotNull 
     */	
	private String parklotId;

	/**
	 * 捷顺车场ID
	 * @NotNull
	 */
	private String parkId;

	/**
	 * 入场过闸ID 关联tc_car_inpass表的id       db_column: carInpass_id
	 * @NotNull
	 */
	private String carInpassId;

	/**
	 * 入场记录唯一标识
	 */
	private String inRecordId;

	/**
	 * 出场记录唯一标识
	 */
	private String outRecordId;

	/**
	 * 入场设备标识
	 */
	private String inDeviceId;

	/**
	 * 入场设备名称
	 */
	private String inDeviceName;

	/**
	 * 入场时间
	 */
	private String inTime;


	/**
	 * 出场设备标识
	 */
	private String outDeviceId;

	/**
	 * 出场设备名称
	 */
	private String outDeviceName;

	/**
	 * 出场识别时间
	 */
	private String outTime;

	/**
     * 车辆ID  关联tc_car表的id       db_column: car_id  
     * @NotNull 
     */	
	private String carId;
	
    /**
     * 车牌号       db_column: car_num  
     * @Length(max=100)
     */	
	private String carNum;


	/**
	 * 车辆颜色
	 */
	private String carColor;
	
    /**
     * 车类型（大车，小车）关联sys_dict 表KIND值 等于CAR_TYPE       db_column: type  
     * 
     */	
	private Integer type;
	
    /**
     * 计费开始时间       db_column: sdate  
     * @Length(max=50)
     */	
	private String sdate;
	
    /**
     * 计费结束时间       db_column: edate  
     * @Length(max=50)
     */	
	private String edate;
	
    /**
     * 停车时长       db_column: park_hour  
     * @NotNull 
     */	
	private Integer parkHour;
	
    /**
     * 车辆进场图片       db_column: intimg  
     * @Length(max=500)
     */	
	private String intimg;
	
    /**
     * 车辆出场图片       db_column: outimg  
     * @Length(max=500)
     */	
	private String outimg;

	//操作员
	private String stationOperator;

	//捷顺单位分，车辆停车应收金额
	private int chargeTotal;
	//捷顺打折金额
	private int discountAmount;
	//捷顺实际缴费金额
	private int charge;
    //套餐名称
	private  String sealName;
	
    /**
     * 记录状态 1：可用;2：不可用 关联sys_dict 表KIND值 等于STATUS       db_column: status  
     * 
     */	
	private Integer status;
	
    /**
     * 创建时间       db_column: create_time  
     * @Length(max=50)
     */	
	private String createTime;
	
	//columns END

	public void setId(String value) {
		this.id = value;
	}
	
	public String getId() {
		return this.id;
	}
	public void setParklotId(String value) {
		this.parklotId = value;
	}
	
	public String getParklotId() {
		return this.parklotId;
	}

	public String getParkId() {
		return parkId;
	}

	public void setParkId(String parkId) {
		this.parkId = parkId;
	}
	public String getCarInpassId() {
		return carInpassId;
	}

	public void setCarInpassId(String carInpassId) {
		this.carInpassId = carInpassId;
	}

	public String getInRecordId() {
		return inRecordId;
	}

	public void setInRecordId(String inRecordId) {
		this.inRecordId = inRecordId;
	}

	public String getOutRecordId() {
		return outRecordId;
	}

	public void setOutRecordId(String outRecordId) {
		this.outRecordId = outRecordId;
	}

	public String getInDeviceId() {
		return inDeviceId;
	}

	public void setInDeviceId(String inDeviceId) {
		this.inDeviceId = inDeviceId;
	}

	public String getInDeviceName() {
		return inDeviceName;
	}

	public void setInDeviceName(String inDeviceName) {
		this.inDeviceName = inDeviceName;
	}


	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutDeviceId() {
		return outDeviceId;
	}

	public void setOutDeviceId(String outDeviceId) {
		this.outDeviceId = outDeviceId;
	}

	public String getOutDeviceName() {
		return outDeviceName;
	}

	public void setOutDeviceName(String outDeviceName) {
		this.outDeviceName = outDeviceName;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public void setCarId(String value) {
		this.carId = value;
	}
	
	public String getCarId() {
		return this.carId;
	}
	public void setCarNum(String value) {
		this.carNum = value;
	}
	
	public String getCarNum() {
		return this.carNum;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setSdate(String value) {
		this.sdate = value;
	}
	
	public String getSdate() {
		return this.sdate;
	}
	public void setEdate(String value) {
		this.edate = value;
	}
	
	public String getEdate() {
		return this.edate;
	}
	public void setParkHour(Integer value) {
		this.parkHour = value;
	}
	
	public Integer getParkHour() {
		return this.parkHour;
	}
	public void setIntimg(String value) {
		this.intimg = value;
	}
	
	public String getIntimg() {
		return this.intimg;
	}
	public void setOutimg(String value) {
		this.outimg = value;
	}
	
	public String getOutimg() {
		return this.outimg;
	}

	public String getStationOperator() {
		return stationOperator;
	}

	public void setStationOperator(String stationOperator) {
		this.stationOperator = stationOperator;
	}

	public int getChargeTotal() {
		return chargeTotal;
	}

	public void setChargeTotal(int chargeTotal) {
		this.chargeTotal = chargeTotal;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public String getSealName() {
		return sealName;
	}

	public void setSealName(String sealName) {
		this.sealName = sealName;
	}

	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setCreateTime(String value) {
		this.createTime = value;
	}
	
	public String getCreateTime() {
		return this.createTime;
	}


}

