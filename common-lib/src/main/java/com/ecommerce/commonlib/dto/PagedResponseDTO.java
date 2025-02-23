package com.ecommerce.commonlib.dto;

import java.util.List;

public class PagedResponseDTO<T> {
    private List<T> content;
    private int page;
    private int size;
    private long totalRecords;
    private int totalPages;
    private boolean last;

    public PagedResponseDTO() {
    }

    public PagedResponseDTO(List<T> content, int page, int size, long totalRecords, int totalPages, boolean last) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.totalRecords = totalRecords;
        this.totalPages = totalPages;
        this.last = last;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }
}
