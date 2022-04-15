package com.example.hesias1.service.dto;

import java.util.Date;

public class MediaListDTO {
    private String commentary;
    private int mark;
    private Date date;
    private UserDTO userDTO;
    private MediaDTO mediaDTO;

    public MediaListDTO() {
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserDTO getUserDTO() {
        return userDTO;
    }

    public void setUserDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public MediaDTO getMediaDTO() {
        return mediaDTO;
    }

    public void setMediaDTO(MediaDTO mediaDTO) {
        this.mediaDTO = mediaDTO;
    }
}
