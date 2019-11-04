package automaticAttendance.users;

final class Proctor extends Faculty{

  @Override //Proctee specific
  private List getAttendance(){
    return list;
  }

  private Report genReport(){
    return report;
  }

  private void messageParent(){
    return;
  }

}
