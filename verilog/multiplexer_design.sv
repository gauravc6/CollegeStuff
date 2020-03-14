module mux(d0,d1,d2,d3,A,B,y);

    input d0,d1,d2,d3,A,B;
    output y;
    inout a,b,p,q,r,s;
    not(a,A);
    not(b,B);
    assign p= d0 & a & b;
    assign q= d1 & a & B;
    assign r= d2 & A & b;
    assign s= d3 & A & B;
    assign y= p|q|r|s;

endmodule
