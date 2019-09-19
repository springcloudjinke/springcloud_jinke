package com.jk.model;

import java.io.Serializable;

/**
 * ClassName: Video
 * describe:
 *
 * @author wanghang
 * @date 2019/09/18 11:50
 */

public class Video implements Serializable {

    private Integer videoid;            //视频表;
    private String videoName;           //视频名称;
    private String videoUrl;            //视频路径;
    private Integer videoTypeId;        //视频类型id;
    private Integer teacherId;          //讲师id;

    public Integer getVideoTypeId() {
        return videoTypeId;
    }

    public void setVideoTypeId(Integer videoTypeId) {
        this.videoTypeId = videoTypeId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }


}
