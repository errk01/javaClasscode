import React, { Component } from "react";
import Iframe from "react-iframe";
export class Page extends Component {
  render() {
    return (
      <div>
        {/* <Iframe
          width="1280"
          height="720"
          src="https://www.youtube.com/embed/_-zWpdq3_2s?list=RD_-zWpdq3_2s"
          frameborder="0"
          allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
          allowfullscreen
        /> */}

        <Iframe
        //   url="https://youtu.be/_-zWpdq3_2s?list=RD_-zWpdq3_2s"
        src="https://www.youtube.com/embed/_-zWpdq3_2s?list=RD_-zWpdq3_2s"
          position="absolute"
          width="50%"
          id="myId"
          className="myClassname"
          height="50%"
          styles={{ height: "25px" }}
        />
      </div>
    );
  }
}

export default Page;
