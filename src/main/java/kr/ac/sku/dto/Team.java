package kr.ac.sku.dto;

public class Team {
	private int t_num;
	private String t_name;
	private String t_picture;
	private String t_leader;
	private String t_call;
	private String t_pwd; // 디비 만들때 String올 하기
	private String t_place;
	private String t_time;
	private int t_power;
	private float t_point;
	private float t_age;
	private boolean t_delete;
	public int getT_num() {
		return t_num;
	}
	public void setT_num(int t_num) {
		this.t_num = t_num;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public String getT_picture() {
		return t_picture;
	}
	public void setT_picture(String t_picture) {
		this.t_picture = t_picture;
	}
	public String getT_leader() {
		return t_leader;
	}
	public void setT_leader(String t_leader) {
		this.t_leader = t_leader;
	}
	public String getT_call() {
		return t_call;
	}
	public void setT_call(String t_call) {
		this.t_call = t_call;
	}
	public String getT_pwd() {
		return t_pwd;
	}
	public void setT_pwd(String t_pwd) {
		this.t_pwd = t_pwd;
	}
	public String getT_place() {
		return t_place;
	}
	public void setT_place(String t_place) {
		this.t_place = t_place;
	}
	public String getT_time() {
		return t_time;
	}
	public void setT_time(String t_time) {
		this.t_time = t_time;
	}
	public int getT_power() {
		return t_power;
	}
	public void setT_power(int t_power) {
		this.t_power = t_power;
	}
	public float getT_point() {
		return t_point;
	}
	public void setT_point(float t_point) {
		this.t_point = t_point;
	}
	public float getT_age() {
		return t_age;
	}
	public void setT_age(float t_age) {
		this.t_age = t_age;
	}
	public boolean isT_delete() {
		return t_delete;
	}
	public void setT_delete(boolean t_delete) {
		this.t_delete = t_delete;
	}
	
	
}
