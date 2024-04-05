package org.rept1l0id.PageURLs;

public enum urlEnumes {

    LOGIN_PAGE_URL("http://localhost:5000/login"),
    SIGNUP_PAGE_UPL("http://localhost:5000/signup"),
    HOME_PAGE_URL("http://localhost:5000/"),
    PROFILE_PAGE_URL("http://localhost:5000/profile");

    private String url;

    urlEnumes(String url){
        this.url = url;
    }

    public String url(){
        return url;
    }

}
