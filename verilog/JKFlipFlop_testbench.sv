module x;

    reg j,k,cl,clk;
    wire q,qb;
    jk s(.j(j),.k(k),.clk(clk),.cl(cl),.q(q),.qb(qb));

    initial begin
        clk=1;
        cl=1;
        $display("J\tK\tQ0\tQ1");
        $monitor("%d\t%d\t%d\t%d",j,k,q,qb)
        j=0;
        k=0;
        #5
        j=0;
        k=1;
        #5
        j=1;
        k=0;
        #5
        j=1;
        k=1;   
    end 

endmodule
