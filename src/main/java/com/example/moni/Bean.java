package com.example.moni;

public class Bean {

    public String msg;
    public SellerBean seller;
    public String code;
    public DataBean data;

    public String getMsg() {
        return msg;
    }

    public SellerBean getSeller() {
        return seller;
    }

    public String getCode() {
        return code;
    }

    public DataBean getData() {
        return data;
    }

    public static class SellerBean {


        public String description;
        public String icon;
        public String name;
        public int productNums;
        public double score;
        public int sellerid;

        public String getDescription() {
            return description;
        }

        public String getIcon() {
            return icon;
        }

        public String getName() {
            return name;
        }

        public int getProductNums() {
            return productNums;
        }

        public double getScore() {
            return score;
        }

        public int getSellerid() {
            return sellerid;
        }
    }

    public static class DataBean {

        public double bargainPrice;
        public String createtime;
        public String detailUrl;
        public String images;
        public int itemtype;
        public int pid;
        public double price;
        public int pscid;
        public int salenum;
        public int sellerid;
        public String subhead;
        public String title;

        public double getBargainPrice() {
            return bargainPrice;
        }

        public String getCreatetime() {
            return createtime;
        }

        public String getDetailUrl() {
            return detailUrl;
        }

        public String getImages() {
            return images;
        }

        public int getItemtype() {
            return itemtype;
        }

        public int getPid() {
            return pid;
        }

        public double getPrice() {
            return price;
        }

        public int getPscid() {
            return pscid;
        }

        public int getSalenum() {
            return salenum;
        }

        public int getSellerid() {
            return sellerid;
        }

        public String getSubhead() {
            return subhead;
        }

        public String getTitle() {
            return title;
        }
    }
}
