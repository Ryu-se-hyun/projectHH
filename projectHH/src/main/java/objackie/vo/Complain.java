/* 역할: 게시물 데이터를 보관 
 * 뭔가 데이터를 보관하는 역할자를 "값 객체(VO; Value Object)"라 부른다.
 * => 다른 말로 "(비즈니스) 도메인 객체(Domain Object)"라 부른다.
 * => 또 다른 말로 "데이터 전송 용으로 사용하는 객체(DTO; Data Transfer Object)"라 부른다.
 * => 용어 정리: VO == DTO == 도메인 객체 
 */
package objackie.vo;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Complain implements Serializable {
  private static final long serialVersionUID = 1L;
  static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

  protected String email;
  protected int no;
  protected int type;
  protected String title;
  protected String contents;
  protected String writer;
  protected Date createdDate; // 이제 java.sql.Date 타입으로 날짜 정보를 제대로 다뤄보자!
  protected int viewCount;
  protected transient String password; // 보안상 암호는 직렬화 대상에서 제외하는 것이 좋다.
  protected String createdDate2; // 클라이언트가 사용할 문자열 형식(yyyy-MM-dd)의 날짜
  protected int rsvd;
  protected String filename;

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public int getRsvd() {
    return rsvd;
  }

  public void setRsvd(int rsvd) {
    this.rsvd = rsvd;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public static SimpleDateFormat getFormat() {
    return format;
  }

  public static void setFormat(SimpleDateFormat format) {
    Complain.format = format;
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCreatedDate2() {
    return createdDate2;
  }

  public void setCreatedDate2(String createdDate2) {
    this.createdDate2 = createdDate2;
  }

  @Override
  public String toString() {
    return "Complain [email=" + email + ", no=" + no + ", type=" + type + ", title=" + title + ", contents=" + contents
        + ", writer=" + writer + ", createdDate=" + createdDate + ", viewCount=" + viewCount + ", createdDate2="
        + createdDate2 + ", rsvd=" + rsvd + ", filename=" + filename + "]";
  }

}
