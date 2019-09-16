package kr.ac.sku.dto;

public class Player {
	private int p_num;
	private int t_num;
	private String p_name;
	private int p_age;
	private int p_power;
	private String p_position;
	private String p_call;
	private boolean p_pro;
	public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public int getT_num() {
		return t_num;
	}
	public void setT_num(int t_num) {
		this.t_num = t_num;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	public int getP_power() {
		return p_power;
	}
	public void setP_power(int p_power) {
		this.p_power = p_power;
	}
	public String getP_position() {
		return p_position;
	}
	public void setP_position(String p_position) {
		this.p_position = p_position;
	}
	public String getP_call() {
		return p_call;
	}
	public void setP_call(String p_call) {
		this.p_call = p_call;
	}
	public boolean isP_pro() {
		return p_pro;
	}
	public void setP_pro(boolean p_pro) {
		this.p_pro = p_pro;
	}
	public boolean isP_delete() {
		return p_delete;
	}
	public void setP_delete(boolean p_delete) {
		this.p_delete = p_delete;
	}
	private boolean p_delete;
	
	
}
