package es.ulpgc.eite.da.advquiz.cheat;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.advquiz.app.AppMediator;
import es.ulpgc.eite.da.advquiz.app.CheatToQuestionState;
import es.ulpgc.eite.da.advquiz.app.QuestionToCheatState;


public class CheatPresenter implements CheatContract.Presenter {

  public static String TAG = "AdvQuiz.CheatPresenter";

  private AppMediator mediator;
  private WeakReference<CheatContract.View> view;
  private CheatState state;
  private CheatContract.Model model;

  public CheatPresenter(AppMediator mediator) {
    this.mediator = mediator;
  }


  @Override
  public void onCreateCalled() {
    Log.e(TAG, "onCreateCalled");

    // init the state
    state = new CheatState();

    // TODO: include code if necessary
  }

  @Override
  public void onRecreateCalled() {
    Log.e(TAG, "onRecreateCalled");

    // TODO: include code if necessary
  }

  @Override
  public void onResumeCalled() {
    Log.e(TAG, "onResumeCalled");

    // TODO: include code if necessary

    // update the view
    view.get().displayAnswerData(state);

  }

  @Override
  public void onPauseCalled() {
    Log.e(TAG, "onPauseCalled");

    // TODO: include code if necessary
  }

  @Override
  public void onDestroyCalled() {
    Log.e(TAG, "onDestroyCalled");

  }

  @Override
  public void onBackButtonPressed() {
    Log.e(TAG, "onBackButtonPressed");

    // TODO: include code if necessary
  }

  @Override
  public void onWarningButtonClicked(int option) {
    Log.e(TAG, "onWarningButtonClicked");

    //option=1 => yes, option=0 => no
    // TODO: include code if necessary
  }


  @Override
  public void injectView(WeakReference<CheatContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(CheatContract.Model model) {
    this.model = model;
  }

}
