package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	//Contrutor no enums é especial, ele vai ser private
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//Esse método público é para dar acesso ao exterior
	public int getCode() {
		return code;
	}
	
	//Método estático para converter valor numérico para o tipo enumerado
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value .getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
