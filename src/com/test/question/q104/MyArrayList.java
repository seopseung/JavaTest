package com.test.question.q104;

public class MyArrayList {
	
	    
	    private String[] list;     
	    private int index;         
	    
	    public MyArrayList() {
	        this.list = new String[4];    
	        this.index = 0;                
	    }
	    
	    public MyArrayList(int capacity) {
	        this.list = new String[capacity];
	        this.index = 0;
	    }
	    
	    public void add(String s) {
	        
	        if (checkLength()) {
	            doubleList();
	        }
	        
	        this.list[this.index] = s;
	        this.index++;
	        
	    }
	 
	    private boolean checkLength() {
	        
	        if (this.index == this.list.length) {
	            return true;
	        }
	        
	        return false;
	    }
	 
	    private void doubleList() {
	        
	        String[] temp = new String[this.list.length * 2];
	        
	        for (int i=0; i<this.list.length; i++) {
	            temp[i] = this.list[i];
	        }
	        
	        this.list = temp;                
	    }
	 
	    public String get(int index) {
	        
	        if (!checkIndex(index)) {
	            throw new IndexOutOfBoundsException();
	        }
	        
	        return this.list[index];
	    }
	 
	    private boolean checkIndex(int index) {
	        
	        if (index >= 0 && index < this.index) {
	            return true;
	        }
	        
	        return false;
	        
	    }
	 
	    public int size() {
	        
	        return this.index;    
	    }
	 
	    public void set(int index, String s) {
	        
	        if (!checkIndex(index)) {
	            throw new IndexOutOfBoundsException();
	        }
	 
	        this.list[index] = s;
	        
	    }
	 
	    public void remove(int index) {
	        
	        for (int i=index; i<=this.list.length-2; i++) {
	            this.list[i] = this.list[i+1];
	        }
	 
	        this.index--;
	        
	    }
	    
	    public void add(int index, String s) {
	        
	        if (checkLength()) {
	            doubleList();
	        }
	        
	        for (int i=this.list.length-2; i>=index; i--) {
	            this.list[i+1] = this.list[i];            
	        }
	        
	        this.list[index] = s;
	        this.index++;
	        
	    }
	 
	    public int indexOf(String s) {
	 
	        for (int i=0; i<this.index; i++) {
	            if (this.list[i].equals(s)) {
	                return i;
	            }
	        }
	        
	        return -1;
	        
	    }
	 
	    public void clear() {
	        
	        //1.
//	        for (int i=0; i<this.index; i++) {
//	            this.list[i] = null;
//	        }
//	                
//	        this.index = 0;
	        
	        //2.
//	        this.list = new String[4];
//	        this.index = 0;
	        
	        //3.
	        this.index = 0;
	                
	    }
	    
	    
	    @Override
	    public String toString() {
	    
	        String temp = "";
	        
	        temp += "\r\n";
	        temp += String.format("length: %d\r\n", this.list.length);
	        temp += String.format("index: %d\r\n", this.index);
	        temp += String.format("[\r\n");
	        for (int i=0; i<this.list.length; i++) {
	            temp += String.format("  %d: %s,\r\n", i, this.list[i]);
	        }
	        temp += String.format("]\r\n");
	        
	        return temp;
	    }
	 
	}