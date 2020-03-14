module halfAdd(a,b,sum,carry);

  input a,b;
  output sum,carry;
  xor(sum,a,b);
  and(carry,a,b);

endmodule

module fullAdd(x,y,z,fsum,c);
  
  input x,y,z;
  output fsum,c;
  inout n,m,f;
  halfAdd s1(x,y,n,m);
  halfAdd s2(n,z,fsum,f);
  or(c,f,m);
  
endmodule
