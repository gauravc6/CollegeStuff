module dem(D,A,B,y0,y1,y2,y3);

  input A,B,D;
  output y0,y1,y2,y3;
  inout a,b;
  not(a,A);
  not(b,B);
  assign y0 = D & a & b;
  assign y1 = D & a & B;
  assign y2 = D & A & b;
  assign y3 = D & A & B;
  
endmodule
