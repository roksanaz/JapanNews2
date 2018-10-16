package com.example.roku1.japannews2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView sectionNameView = (TextView) listItemView.findViewById(R.id.section_name_textv);
        String sectionName = currentNews.getSectionName();
        sectionNameView.setText(sectionName);

        TextView webTitleView = (TextView) listItemView.findViewById(R.id.web_title_textv);
        String webTitle = currentNews.getWebTitle();
        webTitleView.setText(webTitle);

        TextView webPublicationDateView = (TextView) listItemView.findViewById(R.id.web_publication_date_textv);
        String webPublicationDate = currentNews.getWebPublicationDate();
        webPublicationDateView.setText(webPublicationDate);

        TextView authorView = (TextView) listItemView.findViewById(R.id.author_textv);
        String author = currentNews.getAuthor();
        authorView.setText(author);

        return listItemView;
    }
}
