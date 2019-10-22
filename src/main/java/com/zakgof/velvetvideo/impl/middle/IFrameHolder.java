package com.zakgof.velvetvideo.impl.middle;

import com.zakgof.velvetvideo.IDecodedPacket;
import com.zakgof.velvetvideo.impl.VelvetVideoLib.DemuxerImpl.AbstractDecoderStream;
import com.zakgof.velvetvideo.impl.jnr.AVFrame;

public interface IFrameHolder {

	long pts(); // frame.pts.get();

	AVFrame frame();

	IDecodedPacket decode(AVFrame frame, AbstractDecoderStream stream);

}