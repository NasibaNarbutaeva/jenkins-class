terraform {
  backend "s3" {
    bucket = "pushbutton-nasiba"
    key    = "us/app/pushbutton/vpc"
    region = "us-east-1"
  }
}
