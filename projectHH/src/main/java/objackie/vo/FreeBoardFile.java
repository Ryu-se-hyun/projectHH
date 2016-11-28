package objackie.vo;

import java.io.Serializable;

public class FreeBoardFile implements Serializable {
  private static final long serialVersionUID = 1L;

  protected int no;
  protected int boardNo;
  protected String filename;

  

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public int getBoardNo() {
    return boardNo;
  }

  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  @Override
  public String toString() {
    return "FreeBoardFile [no=" + no + ", boardNo=" + boardNo + ", filename=" + filename + "]";  
  }
}



