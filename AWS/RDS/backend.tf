terraform {
  backend "s3" {
    bucket = "pushbutton-farrukh"
    key    = "us/app/pushbutton/rds"
    region = "us-east-1"
  }
}
