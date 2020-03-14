module x;

    reg d,clk;
    wire q,qb;
    d s(.d(d),.clk(clk),.q(q),.qb(qb));

    initial begin
        clk=1;
        $display("D\t\tQ0\tQ1");
        $monitor("%d\t\t%d\t%d",d,q,qb);
        d=0;
        #5
        d = 1;
    end
    
endmodule
