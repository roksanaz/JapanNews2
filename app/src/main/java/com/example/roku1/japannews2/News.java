package com.example.roku1.japannews2;

public class News {
    private String mSectionName;
    private String mWebTitle;
    private String mAuthor;
    private String mWebPublicationDate;
    private String mApiUrl;

    public News (String sectionName, String webTitle, String author, String webPublicationDate, String apiUrl){
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mAuthor = author;
        mWebPublicationDate = webPublicationDate;
        mApiUrl = apiUrl;
    }

    public String getSectionName(){
        return mSectionName;
    }
    public String getWebTitle() {
        return mWebTitle;
    }
    public String getAuthor() {return mAuthor;}
    public String getWebPublicationDate(){
        return mWebPublicationDate;
    }
    public String getApiUrl(){
        return mApiUrl;
    }
}
