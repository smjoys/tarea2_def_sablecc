/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.sableccCarpeta.node;

import srt.sableccCarpeta.analysis.*;

@SuppressWarnings("nls")
public final class Start extends Node
{
    private PListasubtitulo _pListasubtitulo_;
    private EOF _eof_;

    public Start()
    {
        // Empty body
    }

    public Start(
        @SuppressWarnings("hiding") PListasubtitulo _pListasubtitulo_,
        @SuppressWarnings("hiding") EOF _eof_)
    {
        setPListasubtitulo(_pListasubtitulo_);
        setEOF(_eof_);
    }

    @Override
    public Object clone()
    {
        return new Start(
            cloneNode(this._pListasubtitulo_),
            cloneNode(this._eof_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PListasubtitulo getPListasubtitulo()
    {
        return this._pListasubtitulo_;
    }

    public void setPListasubtitulo(PListasubtitulo node)
    {
        if(this._pListasubtitulo_ != null)
        {
            this._pListasubtitulo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pListasubtitulo_ = node;
    }

    public EOF getEOF()
    {
        return this._eof_;
    }

    public void setEOF(EOF node)
    {
        if(this._eof_ != null)
        {
            this._eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._eof_ = node;
    }

    @Override
    void removeChild(Node child)
    {
        if(this._pListasubtitulo_ == child)
        {
            this._pListasubtitulo_ = null;
            return;
        }

        if(this._eof_ == child)
        {
            this._eof_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(Node oldChild, Node newChild)
    {
        if(this._pListasubtitulo_ == oldChild)
        {
            setPListasubtitulo((PListasubtitulo) newChild);
            return;
        }

        if(this._eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    public String toString()
    {
        return "" +
            toString(this._pListasubtitulo_) +
            toString(this._eof_);
    }
}
