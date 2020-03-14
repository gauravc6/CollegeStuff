module t(t,clk,q,qb);

  input t,clk;
  output q,qb;
  inout l;
  wire q,qb;
  nand(l,t,clk);
  nand(a,qb,l);
  nand(b,q,l);
  nand(q,a,qb);
  nand(qb,b,q);
  
endmodule
