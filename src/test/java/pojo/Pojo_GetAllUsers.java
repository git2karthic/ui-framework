package pojo;

import java.util.List;
import java.util.Map;

public class Pojo_GetAllUsers {

	private int page;
	private int per_page;
	private int total;
	private int total_pages;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPer_page() {
		return per_page;
	}

	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTotal_pages() {
		return total_pages;
	}

	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}

	public List<Pojo_Data> getData() {
		return data;
	}

	public void setData(List<Pojo_Data> data) {
		this.data = data;
	}

	public Map<String, String> getSupport() {
		return support;
	}

	public void setSupport(Map<String, String> support) {
		this.support = support;
	}

	private List<Pojo_Data> data;
	private Map<String, String> support;

}
