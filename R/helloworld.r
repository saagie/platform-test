if (!require("data.table")) install.packages("data.table", repos="http://cran.univ-paris1.fr/")

library(data.table)
DT <- data.table(V1=c(1L,2L),
                 V2=LETTERS[1:3],
                 V3=round(rnorm(4),4),
                 V4=1:12)

for(i in 1:10) {
    print(DT[,.(sum(V1),sd(V3))])
    Sys.sleep(5)
}
