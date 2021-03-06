__pcap-reconst__ implements tcp resequencing and http flow extraction.
This project is a fork of the original [pcap-reconst](http://code.google.com/p/pcap-reconst/) 
project with numerous corrections and improvements.

Download
--------

Source is hosted on github: 

[github.com/cjneasbi/pcap-reconst](http://github.com/cjneasbi/pcap-reconst)

Requirements
------------

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/index.html) 6 or greater
* [commons-lang](http://commons.apache.org/lang/) 3.1
* [commons-logging](http://commons.apache.org/logging/) 1.1.1
* [HttpComponents-HttpCore](http://hc.apache.org/httpcomponents-core-ga/index.html) 4.2.1
* [jpcap](https://github.com/mgodave/Jpcap)

__jpcap__ is a wrapper for libpcap or winpcap and requires compilation before use.


Usage
-----

See the HttpReconstructorExample class in the pcap.reconst.example package for usage.

Todo
----
* Test with chunked transfer encoding.
