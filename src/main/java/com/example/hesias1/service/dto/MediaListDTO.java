package com.example.hesias1.service.dto;

import java.util.Date;

public class MediaListDTO {
    private String commentary;
    private int mark;
    private Date date;
    private UserDTO userDTO;
    private MediaListDTO mediaListDTO;

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

    public MediaListDTO getMediaListDTO() {
        return mediaListDTO;
    }

    public void setMediaListDTO(MediaListDTO mediaListDTO) {
        this.mediaListDTO = mediaListDTO;
    }
}
