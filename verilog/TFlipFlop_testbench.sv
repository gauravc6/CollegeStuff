module x;

    reg t,clk;
    wire q,qb;
    t s(.t(t),.clk(clk),.q(q),.qb(qb));
    
    initial begin
        clk=1;
        $display("D\t\tQ0\tQ1");
        $monitor("%d\t\t%d\t%d",t,q,qb);
        t=0;
        #5
        t = 1;
    end

endmodule
