module d(d,clk,q,qb);

  input d,clk;
  output q,qb;
  wire q,qb,a,b,dt;
  not(dt,d);
  nand(a,d,clk);
  nand(b,dt,clk);
  nand(q,a,qb);
  nand(qb,b,q);
  
endmodule
