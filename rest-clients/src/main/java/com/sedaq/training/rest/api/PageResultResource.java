package com.sedaq.training.rest.api;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collections;
import java.util.List;

/**
 * This class is used to replace Page class and reduce number of returned
 * elements (standard Page class contains fields, which are not usefull
 * (backward compatability)).
 *
 * @author Pavel Šeda
 */
@XmlRootElement
public class PageResultResource<E> {

    private List<E> content;
    private Pagination pagination;

    public PageResultResource() {
    }

    public PageResultResource(List<E> content) {
        super();
        this.content = content;
    }

    public PageResultResource(List<E> content, Pagination pageMetadata) {
        super();
        this.content = content;
        this.pagination = pageMetadata;
    }

    public List<E> getContent() {
        return Collections.unmodifiableList(content);
    }

    public void setContent(List<E> content) {
        this.content = content;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Pagination {

        private int number;
        private int numberOfElements;
        private int size;
        private long totalElements;
        private int totalPages;

        public Pagination() {
        }

        public Pagination(int number, int numberOfElements, int size, long totalElements, int totalPages) {
            super();
            this.number = number;
            this.numberOfElements = numberOfElements;
            this.size = size;
            this.totalElements = totalElements;
            this.totalPages = totalPages;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumberOfElements() {
            return numberOfElements;
        }

        public void setNumberOfElements(int numberOfElements) {
            this.numberOfElements = numberOfElements;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public long getTotalElements() {
            return totalElements;
        }

        public void setTotalElements(long totalElements) {
            this.totalElements = totalElements;
        }

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        @Override
        public String toString() {
            return "PageMetadata [number=" + number + ", numberOfElements=" + numberOfElements + ", size=" + size
                    + ", totalElements=" + totalElements + ", totalPages=" + totalPages + "]";
        }
    }

    @Override
    public String toString() {
        return "PageResultDTO [content=" + content + ", pageMetadata=" + pagination + ", getContent()=" + getContent()
                + ", getPageMetadata()=" + getPagination() + "]";
    }

}
