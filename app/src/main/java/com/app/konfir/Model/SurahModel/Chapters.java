package com.app.konfir.Model.SurahModel;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Chapters{

	@SerializedName("chapters")
	private List<ChaptersItem> chapters;

	public List<ChaptersItem> getChapters(){
		return chapters;
	}
}